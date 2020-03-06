package registration.collection;

public class List {
	int size=10;
	private int[] data;
	private int cur=0;
	List(){
		this.data = new int[size];
	}
	
	public int get(int index) throws Exception {
		if(index>this.cur) {
			throw new Exception("ArrayIndexOutOfBound");
		}
		return this.data[index];
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		for(int i=0;i<this.cur;i++) {
			sb.append("index: ");
			sb.append(i);
			sb.append(" Value: ");
			sb.append(this.data[i]+"\n");
		}
		return sb.toString();
	}
	
	public void add(int val) {
		if(cur==size) {
			this.size = this.size*2;
			int [] temparr = new int[this.size];
			for(int i=0;i<this.cur;i++) {
				temparr[i] = this.data[i];
			}
			temparr[this.cur]=val;
			this.cur+=1;
			this.data = temparr;
		}
		this.data[cur]=val;
		this.cur+=1;
		
	}
	
	public void removeByIndex(int index) throws Exception {
		if(index>=this.cur) {
			throw new Exception("ArrayIndexOutOfBound");
		}
		for(int i=index;i<this.cur-1;i++) {
			this.data[i]=this.data[i+1];
		}
		this.cur-=1;
		
	}
	
	public void removeByValue(int val) throws Exception {
		int i=0;
		while(i<this.cur) {
			if(this.data[i]==val)
				break;
			i+=1;
		}
		if(i==this.cur) {
			throw new Exception("ElementNotFound");
		}
		for(int j=i+1;j<this.cur;j++) {
			this.data[i]=this.data[j];
			i+=1;
		}
		this.cur-=1;
	}
	
	public void set(int index,int val) {
		this.data[index] = val;
	}
	
	public int size() {
		return this.cur;
	}
}
