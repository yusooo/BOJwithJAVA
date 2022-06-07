
public class Book04_04 {
    public int x, y, width, height;
    public Book04_04(int a, int b, int c, int d) {
        x=a, y=b, width=c, height=d;
    }
    public int square() {
        return width*height;
    }
    public void show() {
        System.out.println("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");
    }
    public boolean contains(Book04_04 r) {
        if(x<r.x && r.x<x+width) {
            if(y<r.y && r.y<y+height) return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        Book04_04 r = new Book04_04(2, 2, 8, 7);
        Book04_04 s = new Book04_04(5, 5, 6, 6);
        Book04_04 t = new Book04_04(1, 1, 10, 10);

        r.show();
        System.out.println("s의 면적은 "+s.square());
        if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
        if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
    }
}