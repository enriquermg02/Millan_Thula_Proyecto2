package millane_proyecto2;

/**
 *
 * @author leste
 */

public class Queue {
    int lenght;
    Personaje[] items;
    int front;
    int rear;

    public Queue(int lenght) {
        this.lenght = lenght;
        this.items = new Personaje[lenght];
        this.front = -1;
        this.rear = -1;
    }

    public boolean isFull() {
        return rear == lenght - 1;
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public void enQueue(Personaje itemValue) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else if (isEmpty()) {
            front = rear = 0;
            items[rear] = itemValue;
        } else {
            rear++;
            items[rear] = itemValue;
        }
    }

    public Personaje deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        } else if (front == rear) {
            Personaje nodo = items[front];
            front = rear = -1;
            return nodo;
        } else {
            Personaje nodo = items[front];
            for (int i = front; i < rear; i++) {
                items[i] = items[i + 1];
            }
            rear--;
            return nodo;
        }
        
    }
    
    public int size() {
        if (isEmpty()) {
            return 0;
        } else {
            return rear - front + 1;
        }
    }

//    public void display() {
//        if (isEmpty()) {
//            System.out.println("Queue is empty, underflow condition!!");
//        } else {
//            for (int i = front; i <= rear; i++) {
//                System.out.println(items[i]);
//            }
//        }
//    }
    
    public void displayNodes() {
        if (isEmpty()) {
            System.out.println("La cola esta vacia, underflow!!");
        } else {
            for (int i = front; i <= rear; i++) {
                if (items[i] != null) {
                    items[i].printPersonajeId();
                } else {
                    System.out.println("hay null");
                }
            }
        }
    }
    
    public String displayQueue() {
        String result = "La cola esta vacia";
        if (!isEmpty()) {
            
            result = "";
            for (int i = front; i <= rear; i++) {
                if (items[i] != null) {
                    if (i == 0) {
                        result += items[i].getId();
                    } else {
                        result += "," + items[i].getId();
                    }
                } else {
                    System.out.println("hay null"); //revisar
                }
            }
        } 
        return result;
    }

    public Personaje getPeak() {
        if (isEmpty()) {
            System.out.println("La cola esta vacia");
            return null;
        } else {
            return items[front];
        }
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public Personaje[] getItems() {
        return items;
    }

    public void setItems(Personaje[] items) {
        this.items = items;
    }

    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getRear() {
        return rear;
    }

    public void setRear(int rear) {
        this.rear = rear;
    }
    
    
    
}



