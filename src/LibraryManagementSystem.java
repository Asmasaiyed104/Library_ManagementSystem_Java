
public class LibraryManagementSystem {

    // properties
    // this is for book
    String bookTitle;
    String bookAuthor;
    String bookISBN;
    int bookCopies;

    // this is for member
    int memberId;
    String memberName;

    static  final  int MAX_BOOKS = 100;
    static  final int MAX_MEMBERS = 100;

    //array
     static LibraryManagementSystem[]books = new LibraryManagementSystem[MAX_BOOKS];
    static LibraryManagementSystem[]members = new LibraryManagementSystem[MAX_MEMBERS];

    //counters
    static int bookCount = 0;
    static int memberCount = 0;

    // constructor
    public LibraryManagementSystem() {

    }
  // for initialize book instance constructor
    public LibraryManagementSystem(String bookTitle, String bookAuthor, String bookISBN, int bookCopies) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookISBN = bookISBN;
        this.bookCopies = bookCopies;
    }
    // for mrm constructor
    public LibraryManagementSystem(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    //method
    public static void addMember(int memberId, String memberName) {
        if ( memberCount < MAX_MEMBERS) {
            members [memberCount] = new LibraryManagementSystem(memberId, memberName);
            memberCount++;
            System.out.println("Member added : " + memberName);
        }   else {
            System.out.println("Cannot add more members.");
        }
    }
    public static  void  displayAllMembers() {
         System.out.println("Displaying all members:");
        for (int i = 0;  i <  memberCount; i++) {
             System.out.println("Name : " + members[i].memberName + ", Member ID : " + members[i].memberId);
        }
    }
    public static  void  addBook (String bookTitle,  String bookAuthor, String bookISBN, int bookCopies) {
        if (bookCount < MAX_BOOKS) {
            books[bookCount] =  new LibraryManagementSystem (bookTitle, bookAuthor, bookISBN, bookCopies);
            bookCount++;
            System.out.println ("Book added: " + bookTitle);
        } else  {
             System.out.println ("Cannot add more books.");
        }
    }
    public static  void   displayAllBooks() {
         System.out.println(" Displaying all books :");
          for (int i = 0; i < bookCount; i++) {
             System.out.println("Title : " + books[i].bookTitle + ", Author : " + books[i]. bookAuthor +
                    ", ISBN : " + books[i].bookISBN + ", Copies : " + books[i]. bookCopies);
        }
    }

}
