<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<link
        rel="stylesheet"
        href="${pageContext.request.contextPath}/resources/css/common/header.css"
/>
<header>
  <div class="header-logo">
    <a href="/">보령엄마</a>
    <c:choose>
      <c:when test="${empty member}">
        <a href="<c:url value='/member/member.do?method=login'/>">로그인하기</a>
      </c:when>
      <c:otherwise>
        ${member.nickname}
      </c:otherwise>
    </c:choose>
  </div>

  <nav class="search-form">
    <form>
      <div class="search-input">
        <input class="search-bar" type="text" placeholder="학원을 검색해주세요.">
        <span class="search-image--icon">
        <img src="${pageContext.request.contextPath}/resources/imgs/search_icon.png" alt="검색이미지">
        </span>
      </div>
    </form>
  </nav>
</header>
