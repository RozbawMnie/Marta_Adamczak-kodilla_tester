public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1000, 2017);
        System.out.println(notebook.weight);
        System.out.println(notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2019);
        System.out.println(heavyNotebook.weight);
        System.out.println(heavyNotebook.price);
        notebook.checkPrice();
        notebook.checkWeight();

        Notebook oldNotebook = new Notebook(1600, 500, 2005);
        System.out.println(oldNotebook.weight);
        System.out.println(oldNotebook.price);
        notebook.checkPrice();
        notebook.checkWeight();

    }
}