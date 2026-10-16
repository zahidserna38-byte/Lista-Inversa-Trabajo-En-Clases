public class Main {
    public static void main(String[] args) {
        // Lista de vacas
        DoublyLinkedList<Vaca> vacas = new DoublyLinkedList<>();
        vacas.insertLast(new Vaca("Betzy"));
        vacas.insertLast(new Vaca("Lola"));
        vacas.insertFirst(new Vaca("Paola"));

        System.out.println("Recorrido normal:");
        vacas.traverse();

        System.out.println("Recorrido inverso:");
        vacas.traverseBackward();
    }
}