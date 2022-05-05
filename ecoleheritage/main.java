package ecoleheritage;


public class main {

    public static void main(String[] args) {
        System.out.println(" les etudiants");
        Etudiant e = new Etudiant("adama", "ndour", 12, "CI");
        Person e1 = new Etudiant("aziz", "ndour", 25, "passeport");

        System.out.println(e);
        System.out.println(e1);
        System.out.println("les employe");

        Employe E = new Employe("fatou", "fall", 74, 12365547);
        Person E1 = new Employe("modou" , "diouf", 564, 45236985);
        System.out.println(E);
        System.out.println(E1);

        System.out.println("les professeurs");

        Employe P = new Professeur("makhass", "ba",10, 258963140,"HG");
        Person p = new Professeur("couty", "ndiaye", 13, 1000000, "français");

        System.out.println(p);
        System.out.println(P);
//        Person p1 = new Person();
//        p1.setPrenom("adama");
//        p1.setNom("ndour");
//        p1.setId(12);
//             System.out.println(p);²




        }


}
