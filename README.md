# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Taxi`, `TaxiInformation`, dan `TaxiBerjalan` adalah contoh dari class.

```bash
public class Taxi {
    ...
}

public class TaxiInformation extends Taxi {
    ...
}

public class TaxiBerjalan {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `txi[i] = new TaxiInformation(namasupir, nomorplat);` adalah contoh pembuatan object.

```bash
txi[i] = new TaxiInformation(namasupir, nomorplat);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `namasupir` dan `nomorplat` adalah contoh atribut.

```bash
String namasupir;
String nomorplat;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Taxi` dan `TaxiInformation`.

```bash
public Taxi(String namasupir, String nomorplat) {
        this.namasupir = namasupir;
        this.nomorplat = nomorplat;
    }

public TaxiInformation(String namasupir, String nomorplat) {
        super(namasupir, nomorplat);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNamasupir` dan `setNomorplat` adalah contoh method mutator.

```bash
public void setNamasupir(String namasupir) {
        this.namasupir = namasupir;
    }

    public void setNomorplat(String nomorplat) {
        this.nomorplat = nomorplat;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNamasupir`, `getNomorplat`, `getTahunRegistrasiKendaraan`, dan `getAsalKotaKedaraan` adalah contoh method accessor.

```bash
public String getNamasupir() {
        return namasupir;
    }

    public String getNomorplat() {
        return nomorplat;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `namasupir` dan `nomorplat` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String namasupir;
private String nomorplat;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `TaxiInformation` mewarisi `Taxi` dengan sintaks `extends`.

```bash
public class TaxiInformation extends Taxi{
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Taxi` merupakan overloading method `displayInfo` dan `displayInfo` di `TaxiInformation` merupakan override dari method `displayInfo` di `Taxi`.

```bash
public String displayInfo(String tujuan){
        return displayInfo() + "\nTujuan: "+tujuan;
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getAsalKotaKedaraan` dan seleksi `switch` dalam method `getAsalKotaKedaraan`.

```bash
 public int getTahunRegistrasiKendaraan() {
        return Integer.parseInt(getNomorplat() .substring(4, 6)) + 2000 ;


public String getAsalKotaKedaraan(){
        //seleksi if
        if("DA".equals(getNomorplat() .substring(0, 2))){
            return "Kalimantan Selatan";
        } else {
            return "Kota lain";
        }
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for(int i=0; i<txi.length; i++){
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner (System.in);
System.out.print("Masukkan nama supir " +(i+1)+": ");
String namasupir =scanner.nextLine();

System.out.println("================");
System.out.println("Data Taxi");
System.out.println(data.displayInfo());

```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `TaxiInformation[] txi = new TaxiInformation[2];` adalah contoh penggunaan array.

```bash
TaxiInformation[] txi = new TaxiInformation[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
}catch (NumberFormatException e){
    System.out.println("Kesalahan format nomor: "+e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Mahiesta Dila Tahassema 
NPM: 2210010401
