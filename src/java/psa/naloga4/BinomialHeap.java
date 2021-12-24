package psa.naloga4;

import java.util.Vector;

public class BinomialHeap {
	BinomialNode[] data;

	BinomialHeap() {
		data = new BinomialNode[1];
	}

	public boolean insert(int key) {
		// True <- vstavljen
		// False <- ni bil/ je ze not
		// IF array mejhen ga resizaš.
		// ----------------------------

		BinomialNode tmp = new BinomialNode(key);
		
		for (int i = 0; i < data.length-1; i++) {
			if (!(data[i]==null)) {
				if ((data[i+1]==null)) {
					if (i+1>data.length) {
						resizeArray();
						data[i+1] = merge(data[i], tmp);
						return true;
					}
					data[i+1] = merge(data[i], tmp);
					return true;
				}
			}
			data[i] = tmp;
			return true;
		}
		return false;
	}

	public int getMin() {

	}

	public boolean delMin() {

	}

	private void resizeArray() {
		BinomialNode[] tmp = new BinomialNode[data.length * 2];
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = data[i];
		}
		this.data = tmp;
	}

	private BinomialNode merge(BinomialNode t1, BinomialNode t2) {
		// vzam manši root, pinaš večjega nanga,

		if (t1.getKey()==t2.getKey()) {System.out.println("hmmm...");}
	
		if ( t1.getKey() < t2.getKey() ) {
			t1.addChild(t2);
		} else if ( t1.getKey() > t2.getKey() ) {
			t2.addChild(t1);
	}
}
