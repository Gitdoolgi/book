const boardPk = new URLSearchParams(location.search).get('seq');
$('form[name="hi"]').submit(async (e) => {
    e.preventDefault()
    const btn = ($(e.target).children()[0])
    const formEle = $('form[name="hi"]');
    let result = 0;
    // console.log($(btn).text())
    if ($(btn).text().trim() === '예약취소') {
        confirm("예약취소 하시겠습니까?")
    } else {
        confirm("예약 하시겠습니까?")
    }
    formEle.attr('action', `/book/${boardPk}`);
    result = await $.get(formEle.attr('action'));
    const obj = JSON.parse(result)
    console.log(obj)
    if (obj.result === '1') {
        location.href = `/board?seq=${boardPk}`
    }
})