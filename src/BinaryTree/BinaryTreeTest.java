package BinaryTree;

/**
 * Created by Admin on 31.07.2016.
 */
public class BinaryTreeTest {

    public static void main(String[] args) {
      BinaryTreeFunctionality functionality = new BinaryTreeFunctionality();
        functionality.addNoda("A",50);
        functionality.addNoda("B",20);
        functionality.addNoda("C",80);
        functionality.inOrderPrint(functionality.root);
        System.out.println(" root "+ functionality.root);
        Noda found = functionality.findNoda(20);
        System.out.println(" \r\n  noda found is " + found);

    }
}
class BinaryTreeFunctionality{

    Noda root;

    public void addNoda(String name, int key){

          Noda newNoda = new Noda(name, key);

          if(root == null){
              root = newNoda;//first attempt
          }else{
              Noda focusNoda = root;
              Noda  parent;//for later reassigning

              while (true){
                  parent = focusNoda;//will reassign later - for now focus is on root

                  if(key < focusNoda.key){
                      focusNoda = focusNoda.leftChild;//new focus step down to left child
                      if(focusNoda == null){//if nothing there - put new here
                          parent.leftChild = newNoda;
                          return;//break while  loop
                      }
                  }else{
                      focusNoda = focusNoda.rightChild;
                      if(focusNoda == null){
                          parent.rightChild = newNoda;
                          return;
                      }
                  }
              }
          }

    }//add


    public Noda findNoda(int key){
       Noda focus = root;
        if(key != focus.key){
            if(key < focus.key){
                focus = focus.leftChild;
            }else {
                focus = focus.rightChild;
            }

            if(focus == null){
                return null;
            }
        }

        return focus;
    }


    public void inOrderPrint(Noda focusNoda){
        if(focusNoda!=null){
            inOrderPrint(focusNoda.leftChild);
            System.out.println(focusNoda);
            inOrderPrint(focusNoda.rightChild);
        }
    }

    public void inPreOrderPrint(Noda focusNoda){
        if(focusNoda!=null){
            System.out.println(focusNoda);

            inOrderPrint(focusNoda.leftChild);
            inOrderPrint(focusNoda.rightChild);
        }
    }

    public void inPostOrderPrint(Noda focusNoda){
        if(focusNoda!=null){
            inOrderPrint(focusNoda.leftChild);
            inOrderPrint(focusNoda.rightChild);
            System.out.println(focusNoda);

        }
    }
}







class Noda{

    String name;
    int key;

    Noda leftChild;
    Noda rightChild;


    public Noda(String name, int key) {
        this.name = name;
        this.key = key;
    }

    @Override
    public String toString() {
        return "Noda{" +
                "name='" + name + '\'' +
                ", key=" + key +
                '}';
    }


}