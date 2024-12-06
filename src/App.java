import materia.Stacks.Stack;
import materia.Stacks.StackGeneric;
import models.Pantalla;

public class App {
    public static void main(String[] args) throws Exception {
        //runStack();
        runStackGeneric();
    }

    public static void runStack(){
        //instanciar la clase
        Stack stack = new Stack();

        //agregar elementos a la pila.
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(20);

        //mostrar los valores
        System.out.println("Cima    -> "+stack.peek());
        System.out.println("Retirar    -> "+stack.pop());
        System.out.println("Cima    -> "+stack.peek());
        System.out.println("Retirar    -> "+stack.pop());
        System.out.println("Cima    -> "+stack.peek());

        //mostrar el tamaño
        System.out.println("Tamaño: "+stack.getSize());
    }

    public static void runStackGeneric(){
        //instanciar la clase
        StackGeneric<Pantalla> router = new StackGeneric<>();
        router.push(new Pantalla(1,"Home Page","/home"));
        router.push(new Pantalla(1,"Menu Page","/home/menu"));
        router.push(new Pantalla(1,"Users Page","/home/menu/users"));

        System.out.println("Estoy en " + router.peek().getRuta());
        //System.out.println("Regreso a "+router.pop().getRuta());
        System.out.println("Regreso a "+(router.popNode().getNext().getValue()).getRuta());
        System.out.println("Estoy en " + router.peek().getRuta());

        router.push(new Pantalla(1,"Settings Page","/home/menu/users/settings"));

        System.out.println("\nPantallas = "+router.getSize());
        System.out.println("Estoy en " + router.peek().getRuta());
        router.printStack();
    }
}
