package book;

public class BookService {
    private static BookService instance = new BookService();
    private BookDAO bookDAO;

    private BookService() {
        bookDAO = new BookDAO();
    }

    public static BookService getInstance() {
        return instance;
    }

    public ResponseDTO getBookByBoardPK(long boardPk) {
        int totalBookLimit = bookDAO.getTotalBookLimit(boardPk);
        int bookCnt = bookDAO.getBookCnt(boardPk);
        return new ResponseDTO(totalBookLimit, bookCnt);
    }

    public int getBookUser(long review, long boardPk) {
        int bookUser = bookDAO.getBookUser(review, boardPk);
        return bookUser;
    }

    public int insertBook(long memberPk, long boardPK) {
        return bookDAO.insertBook(memberPk, boardPK);
    }

    public int updateBook(long memberPk, long boardPK) {
        return bookDAO.updateBook(memberPk, boardPK);
    }

    public int reUpdateBook(long memberPk, long boardPK) {
        return bookDAO.reUpdateBook(memberPk, boardPK);
    }

    public int getCancelBook(long memberPk, long boardPK) {
        return bookDAO.getCancelBook(memberPk, boardPK);
    }
}