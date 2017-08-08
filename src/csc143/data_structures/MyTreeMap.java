package csc143.data_structures;

import java.util.Comparator;
/**
 * MyTreeMap -- creates a map using the binary search tree data structure
 * CSC143 - HW6
 * Minimum
 * 
 * @author Evan Kohout
 * @param <K> -- Key object
 * @param <V> -- Value object
 */
public class MyTreeMap<K, V> implements BasicMap<K, V> {

	// fields
	private Node root;
	private Comparator<Object> keyComp;

	// Helper class for node traversal
	private class Node {
		private K key;
		private V val;
		private Node left, right;
		private int size;

		// constructor
		public Node(K key, V val, Node left, Node right) {
			this.key = key;
			this.val = val;
			this.size = size;
		}

		/*
		 * lookup -- used for searching the map to return a value for a given key
		 */
		public V lookup(Object key, Comparator<Object> keyComp) {
			int cmp = keyComp.compare(key, this.key);
			/* base case -- if the key is the same as the one that 
			 * is being searched for, cmp will equal 0 and the value will be returned
			 */
			if (cmp == 0) {
				return val;
			// search left child
			} else if (cmp < 0 && left != null) {
				return left.lookup(key, keyComp);
			// search right child
			} else if (cmp > 0 && right != null) {
				return right.lookup(key, keyComp);
			} else {
				// key not present
				return null; 
			}
		}
		
		/*
		 * insert -- used for inserting a new key/value pair into the map
		 */
		public V insert(K key, V val, Comparator<Object> keyComp) {
			int cmp = keyComp.compare(key, this.key);
			// base case
			if (cmp == 0) {
				// replace value
				V old = this.val;
				this.val = val;
				return old;
			} else if (cmp < 0) {
				if (left == null) {
					left = new Node(key, val, left, right);
					return null;
				} else {
					return left.insert(key, val, keyComp);
				}
			} else {
				if (right == null) {
					right = new Node(key, val, left, right);
					return null;
				} else {
					return right.insert(key, val, keyComp);
				}
			}
		}
	}

	/**
	 * constructor -- builds a new MyTreeMap object with zero nodes
	 */
	public MyTreeMap() {
		root = null;
	}

	/**
	 * put -- inserts a new key/value pair into the map
	 * @param key -- the key to be added
	 * @param value -- the value associated with the key to be added
	 * This method is O(n) complexity
	 */
	@Override
	public void put(K key, V value) {
		if (root == null) {
			root = new Node(key, value, root.left, root.right);
		} else {
			root.insert(key, value, keyComp);
		}
	}

	/**
	 * get -- retrieves a value for a given key in the map
	 * @param key -- the key to be used for retrieval]
	 * @return V -- the value to be returned
	 * this method is O(n) complexity
	 */
	@Override
	public V get(Object key) {
		if (root == null) {
			return null;
		} else {
			return root.lookup(key, keyComp);
		}
	}

	/**
	 * isEmpty -- used to determine whether the map is empty or not
	 * this method is O(n) complexity
	 */
	@Override
	public boolean isEmpty() {
		return size(root) == 0;
	}

	private int size(Node x) {
		if (x == null)
			return 0;
		else
			return x.size;
	}

	/**
	 * clear -- used to clear the map
	 * this method is O(n) complexity
	 */
	@Override
	public void clear() {
		root = null;
	}

}
