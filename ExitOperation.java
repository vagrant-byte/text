package operation;

import book.BookList;

public class ExitOperation implements IOperation {

    @Override
    public void work(BookList bookList) {
        System.exit(0);
        System.out.println("退出系统");

    }
}
