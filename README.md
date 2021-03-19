
# View Model
Class View Model didesain untuk menyimpan dan mengelola data terkait UI dengan cara yang berbasis siklus proses. Class ViewModel memungkinkan data bertahan saat terjadi perubahan konfigurasi seperti pada saat rotasi layar.
View Model berfungsi menyimpan dan mengembalikan data yang terikat dengan suatu activity maupun fragment sehingga aplikasi kita dapat menggunakan data yang sebelumnya sudah dimiliki. 

## View Pager 
Viewpager adalah komponen android yang sering dipakai untuk menampilkan data dalamformat full screen dan bisa berpindah antar data dengan menggeser ke kiri atau kekanan. ViewPager akan bertugas menampilkan fragment, lalu TabLayout akan menjadi navigasinya. Setiap page bisa berisi layout yang berbeda-beda, karena akan ditangani oleh Fragment dan kita bisa mengisinya dengan apapun yang diinginkan.
## Splash Screen
Splash screen adalah istilah yang diberikan pada layar pembuka setiap kali kita menjalankan sebuah aplikasi Android. Splash Screen digunakan untuk load data,  menjalankan file konfigurasi, dan proses suatu algoritma tertentu. 

## Intro Slider
Intro slider atau Intro selamat datang di aplikasi merupakan langkah terbaik untuk menampilkan fitur utama dari aplikasi Android. Tampilan sekilas ini sebagai promosi juga agar pengguna tidak merasa bingung menggunakan aplikasi kita. Intro Slider hanya muncul satu kali setelah aplikasi digunakan.

## Intent 
Intent merupakan suatu objek yang terdapat dalam suatu activity dimana objek tersebut dapat komunikasi dengan activity yang lain, baik activity pada fungsi internal android misal seperti memanggil activity dalam satu package atau beda package yang masih berada dalam satu project.

Ada tiga penggunaan umum intent :

1. Memindahkan satu activity ke activity lain dengan atau tidak membawa data.
2. Menjalankan background service, misalnya melakukan sinkronisasi ke server dan menjalankan proses berulang (periodic/scheduler task).
3. Mengirimkan obyek broadcast ke aplikasi yang membutuhkan. Misal, ketika aplikasi membutuhkan proses menjalankan sebuah background service setiap kali aplikasi selesai melakukan booting. Aplikasi harus bisa menerima obyek broadcast yang dikirimkan oleh sistem Android untuk event booting tersebut.

## Fragment
Fragment merupakan salah satu komponen pada Android Studio dengan fungsi yang hampir sama seperti activity tetapi memiliki “lifecycle” yang berbeda.

Fragment merupakan kombinasi sebuah layout XML dan kelas java yang mirip dengan sebuah Activity yang memiliki fungsi untuk menampilkan antarmuka ke pengguna. Dengan menggunakan support library, fragment dapat mendukung hampir semua versi Android. Fragment digunakan agar komponen tampillan aplikasi menjadi fleksibel dan dapat digunakan kembali ( reusable). Fragment merupakan komponen utuh yang memiliki view, event, dan logic (meskipun tetap membutuhkan sebuah fragment agar dapat bekerja).

Fragment juga bisa disebut sub nya activity (Sebuah fragment harus berada di dalam sebuah activity, mereka tidak dapat berjalan sendiri tanpa adanya activity tempat mereka menempel). Dalam satu activity bisa memiliki lebih dari satu fragment.

[] Kelebihan yang didapatkan bila menggunakan fragment adalah sebagai berikut:

- Tidak perlu memasukkan nama file fragment ke dalam “AndroidManifest” yang diperlukan oleh activity.
- Fungsi yang berada pada activity dapat langsung digunakan dalam fragment tersebut tanpa harus membuat ulang.

[] Pentingnya Sebuah Fragment

- Penggunaan Komponen View dan Logic Berulang Kali : Fragment dapat dipakai untuk menampilkan data atau melakukan event tertentu dibeberapa activity berbeda.
- Dukungan Untuk Tablet : Fragment memungkinkan activity untuk menggunakan fragment dalam membuat antarmuka sesuai dengan perangkat yang membukanya.
- Orientasi Layar : Fragment memungkinkan untuk menggunakan tampilan yang berbeda( horizontal atau vertikal) menggunakan elemen yang sama.

[] Fragment Lifecyle

Fragment memiliki sirkulasi kehidupan atau yang biasanya disebut “lifecycle”, seperti yang ditunjukkan pada Gambar di bawah ini :
![0EVReuq](https://user-images.githubusercontent.com/60412314/109187982-0325be80-77c5-11eb-8e0e-c9cb9907ae22.png)

[] Pembuatan Sebuah Fragment

Sebuah fragment, seperti activity, memiliki XML layout-nya sendiri dan sebuah kelas java sebagai controller dari Fragment tersebut.Layout XML yang dimiliki oleh fragment, sama seperti layout-layout lainnya dan bisa memiliki nama apa saja (selama memiliki format yang ditentukan). 


## Komponen Aplikasi
1. Splash Screen
2. Intro Slider
3. Fragment
4. Intent
5. Liner Layout & Relative Layout

## Penerapan dan Tampilan
1. Splash Screen
Splash screen akan muncul di layar pembukan setiap pennguna jika ingin mengoperasikan aplikasinya.

![WhatsApp Image 2021-03-19 at 20 30 59](https://user-images.githubusercontent.com/60412314/111790781-25f35080-88f5-11eb-8d0b-a50ae0d8d897.jpeg)

(Perpindahan antara halaman Splash Screen dengan Intro Slide menggunakan Intent).

2. Intro Slide
- Slide pertama menampilkan fungsi juga kelebihan dari View Model.

![WhatsApp Image 2021-03-19 at 20 30 59 (1)](https://user-images.githubusercontent.com/60412314/111790691-0c520900-88f5-11eb-8e31-8c26c80d17ab.jpeg)

- Slide kedua menampilkan fungsi juga kelebihan dari Fragment

![WhatsApp Image 2021-03-19 at 20 30 59 (2)](https://user-images.githubusercontent.com/60412314/111790924-4de2b400-88f5-11eb-8073-65bf9d881de3.jpeg)

- Slide ketiga menampilkan fungsi dan kelebihan Linear layout

![WhatsApp Image 2021-03-19 at 20 30 59 (3)](https://user-images.githubusercontent.com/60412314/111791158-88e4e780-88f5-11eb-9227-4e3875f4e149.jpeg)

- Slide keempat menampilkan penjelasan tentag Intro Slide

![WhatsApp Image 2021-03-19 at 20 30 59 (4)](https://user-images.githubusercontent.com/60412314/111791260-a1550200-88f5-11eb-9355-c41cb5645cba.jpeg)

4. Halaman utama dengan Intent
Terdapat tampilan halamn utama, didalamnnya ada 2 button. 
- Button pertama digunakan untuk perpindahan halaman utama menuju halaman fragment.
- Button kedua digunkan untuk perpindahan halaman utama menuju halaman detail data diri seseorang.
(perpindahan tersebut menggunkaan Intent).
![Screenshot_20210320_002121](https://user-images.githubusercontent.com/60412314/111821007-c016c100-8914-11eb-9c04-f1682db06dde.jpg)

3. Button pertama menuju = Fragment Awal Aplikasi
- Fragment Pertama : Menampilkan from identitas yang bisa diisi oleh user

![WhatsApp Image 2021-03-19 at 20 30 59 (9)](https://user-images.githubusercontent.com/60412314/111792181-96e73800-88f6-11eb-81e4-14fea112a64b.jpeg)

- Fragment kedua : Tempat untuk menampilkan hasil folmulir yang akan diisi user

![WhatsApp Image 2021-03-19 at 20 30 59 (10)](https://user-images.githubusercontent.com/60412314/111792182-977fce80-88f6-11eb-853d-fc1367d323a1.jpeg)

4. Fragment yang telah diisi
- First Fragment = Tab1

![WhatsApp Image 2021-03-19 at 20 30 59 (11)](https://user-images.githubusercontent.com/60412314/111792204-9d75af80-88f6-11eb-8dc5-7549d518bae9.jpeg)

- Second fragment = Tab2

![WhatsApp Image 2021-03-19 at 20 30 59 (12)](https://user-images.githubusercontent.com/60412314/111792241-a49cbd80-88f6-11eb-9c29-41ff68f7b84d.jpeg)
 
 (Data dari from di fragment pertama(tab1) yang telah diisi akan dibawa ke fragment kedua(tab2)).
 
 5. Button kedua menuju = detail data diri seseorang
 6. 
 ![Screenshot_20210320_002959](https://user-images.githubusercontent.com/60412314/111820998-bdb46700-8914-11eb-8917-184bcd803aa9.jpg)
 
 # Terimakasih :)
 
 
 
