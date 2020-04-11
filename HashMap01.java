package MyHashMap;

public class HashMap01{
	Node[] table;//λͰ����
	int size;//��ż�ֵ�Եĸ���
	
	public  HashMap01(){
		table=new Node[16];//��ʼ����������16
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
		/*����һ���µĽڵ����*/
		Node newNode=new Node();
		newNode.hash=myHash(key.hashCode(),table.length);
		newNode.keyObject=key;
		newNode.valueObject=value;
		newNode .nextNode=null;
		
		Node tempNode=table[newNode.hash];
		Node lastNode=null;//������¼��������һ��Ԫ��
		boolean keyRepeat=false;
		
		
		if(tempNode==null)
		{
			//��ʱ����Ԫ��λ��Ϊ�գ�ֱ�ӽ��½��Ž�ȥ����
			table[newNode.hash]=newNode;
		}else {
			//����Ԫ�ز�Ϊ�գ����������
			while(tempNode!=null)
			{
				//key����ظ��򸲸�
				if(tempNode.keyObject.equals(key))
				{
					System.out.println("���ظ���keyֵ����");
					
					tempNode.valueObject=value;
					//ֻ��Ҫ���µ�valueֵ���Ǿɵ�valueֵ
					keyRepeat=true;
					
					break;
				}else {
				//���ظ��������������������β��
				lastNode=tempNode;
				tempNode=tempNode.nextNode;
				}
			}
			if(!keyRepeat)
				lastNode.nextNode=newNode;//���µĽ��ɹ����������β��
		}
		
			
	}
	
	//�����Ӧ��hashֵ
	public int myHash(int v,int length)
	{
		/*hashֵ�������ַ�����
		 * hash=v&(length-1);Ҫ�󳤶ȱ�����2���������ݣ�Ч�ʽϸ�
		 * hash=v%(length-1);ȡģ����Ч�ʽϵ�
		 * ���ö���ɢ�����ã�����ֵ��һ��
		 */
		System.out.println("λhash"+(v&(length-1)));
		System.out.println("ģhash"+(v%(length-1)));
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