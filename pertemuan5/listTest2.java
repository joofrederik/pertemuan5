package pertemuan5;

public class listTest2 {
	public static void main(String[] args) {
        strukturList list = new strukturList();
        System.out.println("LATIHAN 2");
        list.addHead(2);
        list.addMiddle(6, 2);
        list.addMiddle(3, 3);
        list.addMiddle(5, 4);
        list.addTail(1);
        list.displayElement();
        System.out.println("\nHapus elemen di akhir list : ");
        list.removeMid(3);
        list.displayElement();
        System.out.println("\nHapus elemen di akhir list : ");
        list.removeMid(6);
        list.removeMid(5);
        list.displayElement();
	}
}

