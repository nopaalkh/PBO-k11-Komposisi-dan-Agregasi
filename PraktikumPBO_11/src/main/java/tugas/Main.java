/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author hp
 */
// Kelas Pengarang
class Pengarang {
    private String namaPengarang;

    // Konstruktor
    public Pengarang(String namaPengarang) {
        this.namaPengarang = namaPengarang;
    }

    // Metode untuk menampilkan informasi pengarang
    public void infoPengarang() {
        System.out.println("Nama Pengarang: " + namaPengarang);
    }
}

// Kelas Buku
class Buku {
    private String judul;
    private Pengarang pengarang;

    public Buku(String judul, Pengarang pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public void infoBuku() {
        System.out.println("Judul Buku: " + judul);
        pengarang.infoPengarang();
    }
}

// Kelas Perpustakaan
class Perpustakaan {
    private Buku[] daftarBuku;
    private int jumlahBuku;

    public Perpustakaan(int kapasitas) {
        daftarBuku = new Buku[kapasitas];
        jumlahBuku = 0;
    }

    public void tambahBuku(Buku buku) {
        if (jumlahBuku < daftarBuku.length) {
            daftarBuku[jumlahBuku] = buku;
            jumlahBuku++;
        } else {
            System.out.println("Perpustakaan sudah penuh!");
        }
    }

    public void infoPerpustakaan() {
        System.out.println("Daftar Buku di Perpustakaan:");
        for (int i = 0; i < jumlahBuku; i++) {
            daftarBuku[i].infoBuku();
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Pengarang pengarang1 = new Pengarang("Daniel Goleman");
        Pengarang pengarang2 = new Pengarang("William James");

        Buku buku1 = new Buku("Emotional Intelligence", pengarang1);
        Buku buku2 = new Buku("The Principles of Psychology", pengarang2);

        Perpustakaan perpustakaan = new Perpustakaan(5);
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.infoPerpustakaan();
    }
}