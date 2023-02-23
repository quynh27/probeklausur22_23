package probeklausur_22_23;

public class Bag<T> {
	public static void main(String[] args) {
		Bag<Integer> mybag = new Bag<Integer>();
		mybag.add(1);
		mybag.add(2);
		mybag.add(3);
		mybag.add(4);

		mybag.remove(1);

	}

	public Node<T> top;

	public Bag() {
		super();
	}

	public void add(T elem) {
		if (this.top == null) {
			this.top = new Node<T>(elem);
		}
		Node<T> newElem = new Node<T>(elem);
		newElem.next = this.top;
		this.top = newElem;

	}

	public int size() {
		int size = 0;
		if (this.top == null) {
			return size;
		}
		Node<T> traverse = this.top;
		while (traverse.next != null) {
			size++;
			traverse = traverse.next;
		}
		return size;
	}

	public int count(T elem) {
		int count = 0;
		if (this.top == null) {
			return count;
		}
		Node<T> traverse = this.top;
		while (traverse != null) {
			if (traverse.value == elem) {
				count++;
			}
			traverse = traverse.next;

		}
		return count;

	}

	public boolean contains(T elem) {
		boolean found = false;
		if (this.top == null) {
			return found;
		}
		Node<T> traverse = this.top;
		while (traverse != null) {
			if (traverse.value == elem) {
				found = true;

				break;
			}
			traverse = traverse.next;

		}
		return found;

	}

	public void remove(T elemen) {
		if (!this.contains(elemen)) {
			return;
		}
		if (this.size() == 1) {
			this.top = this.top.next;
		} else {
			Node<T> current = this.top;
			Node<T> prev = null;
			while (current != null) {
				if (current.value.equals(elemen)) {
					if (prev == null) {
						this.top = this.top.next;

					} else {
						prev.next = current.next;

					}
					return;
				}
				prev = current;
				current = current.next;
			}
		}

	}

}
