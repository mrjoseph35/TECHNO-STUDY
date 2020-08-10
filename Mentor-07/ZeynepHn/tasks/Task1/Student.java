package Mentor.ZeynepHn.tasks.Task1;
    /*
    //isim, bolum, yas, birinciSinav, ikinciSinav ve ucuncuSinav instance variable
    // (degiskenlerini) iceren bir Ogrenci class i olusturunuz
    //ogrencinin not ortalamasini hesaplayacak bir method olusturunuz.
    */
public class Student {
        String name;
        String bolum;
        int yas;
        int birinciSinav;
        int ikinciSinav;
        int ucuncuSinav;

//        public Student creatStudent() {
//            Student student = new Student();
//            student.name = name;
//            student.yas = yas;
//            return student;
//        }


        double notOrtalam() {

            return (birinciSinav + ikinciSinav + ucuncuSinav) / 3;
        }


    }