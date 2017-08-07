package csc143.data_structures;

public class MyTreeMap<K, V> implements BasicMap <K, V> {
	
	private Node root;
		
	private class Node {
		private K key;
		private V val;
		private Node left, right;
		private int size;
		public Node(K key, V val, Node left, Node right){
			this.key = key;
			this.val = val;
			this.size = size;
		}
	}
	
	public MyTreeMap() {
		root = null;
	}

	@Override
	public void put(K key, V value) {
		
		
	}
	
	
	@Override
	public V get(Object key) {
		
		return null;
	}

	@Override
	public boolean isEmpty() {
		
		return false;
	}

	@Override
	public void clear() {
		
		
	}

}


