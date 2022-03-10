
public class LL1 {
	Node head;

	class Node {
		Node next;
		int data;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		LL1 list = new LL1();
		list.addFirst(2);
		list.addFirst(1);
		list.addFirst(0);
		list.printList();
		System.out.println();
		list.addLast(3);
		list.printList();

	}

	private void addLast(int data) {
		Node new_node = new Node(data);

		if (head == null) {
			head = new_node;
			return;
		}
		Node lastNode = head;
		while (lastNode.next != null) {
			lastNode = lastNode.next;  // Iteration
		}
		lastNode.next = new_node;
	}

	private void printList() {
		if (head == null) {
			return;
		}
		Node current_Node = head;
		while (current_Node != null) {
			System.out.print(current_Node.data + " -> ");
			current_Node = current_Node.next; // continuing with next Node
		} 
		System.out.println("null");

	}

	private void addFirst(int data) {
		Node new_node = new Node(data);
		if (head == null) {
			head = new_node;
			return;
		}
		new_node.next = head;
		head = new_node;

	}
}
