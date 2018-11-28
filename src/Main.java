public class Main {

    public static void main(String[] args) {
	// write your code here



        Liste liste = new Liste();

        liste.insertFromHead(new Node("ole"));
        liste.insertFromHead("nikolaj");
        liste.insertFromHead("brian");
        liste.insertFromHead("jane");
        liste.insertFromTail("kenny");

        System.out.println(liste.printFromTail());



   //         System.out.println(liste.findNode("ole-erling").data);




            liste.deleteNode("kenny");

            liste.insertbefore("nikolaj","ole-erling");

        System.out.println(liste.printfromHead());

        System.out.println("slutter programmet");




    }
}
