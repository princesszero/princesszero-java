package MyHashMap;

public class HashMap01{
	Node[] table;//位桶数组
	int size;//存放键值对的个数
	
	public  HashMap01(){
		table=new Node[16];//初始化的容量是16
	}
	
	public Object get(Object key)
	{
		int hash=myHash(key.hashCode(),table.length);
		Object value=null;
		if(table[hash]!=null)
		{
			Node tempNode=table[hash];
			while(tempNode!=null)
			{
				if(tempNode.keyObject.equals(key))
				{
					value=tempNode.valueObject;
					break;
				}
				tempNode=tempNode.nextNode;
			}
		}
			
		
		return value;
	}
	
	
	
	public  void put(Object key,Object value) {
		/*定义一个新的节点对象*/
		Node newNode=new Node();
		newNode.hash=myHash(key.hashCode(),table.length);
		newNode.keyObject=key;
		newNode.valueObject=value;
		newNode .nextNode=null;
		
		Node tempNode=table[newNode.hash];
		Node lastNode=null;//用来记录链表的最后一个元素
		boolean keyRepeat=false;
		
		
		if(tempNode==null)
		{
			//此时数组元素位置为空，直接将新结点放进去即可
			table[newNode.hash]=newNode;
		}else {
			//数组元素不为空，则遍历链表
			while(tempNode!=null)
			{
				//key如果重复则覆盖
				if(tempNode.keyObject.equals(key))
				{
					System.out.println("有重复的key值出现");
					
					tempNode.valueObject=value;
					//只需要用新的value值覆盖旧的value值
					keyRepeat=true;
					
					break;
				}else {
				//不重复，遍历链表，加入链表的尾部
				lastNode=tempNode;
				tempNode=tempNode.nextNode;
				}
			}
			if(!keyRepeat)
				lastNode.nextNode=newNode;//将新的结点成功加入链表的尾部
		}
		
			
	}
	
	//计算对应的hash值
	public int myHash(int v,int length)
	{
		/*hash值计算两种方法：
		 * hash=v&(length-1);要求长度必须是2的整数次幂，效率较高
		 * hash=v%(length-1);取模运算效率较低
		 * 作用都是散列作用，但是值不一样
		 */
		System.out.println("位hash"+(v&(length-1)));
		System.out.println("模hash"+(v%(length-1)));
		return v&(length-1);
	}
	public static void main(String[] args) {
		HashMap01 hashMap01=new HashMap01();
		hashMap01.put(10, 2);
		hashMap01.put(20, 3);
		//hashMap01.put(10,5);
		hashMap01.put(69, 4);
		hashMap01.put(53, 1);
		hashMap01.put(85, 2);
		System.out.println("get"+hashMap01.get(53));
	}
}