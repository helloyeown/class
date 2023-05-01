package todo.domain;

public class Todo {

	private int no;
	private String todo;
	private String duedate;
	private String complete;
	
	public Todo() {}
	
	public Todo(int no, String todo, String duedate, String complete) {
		this.no = no;
		this.todo = todo;
		this.duedate = duedate;
		this.complete = complete;
	}
	
	

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

	public String getDuedate() {
		return duedate;
	}

	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}

	public String getComplete() {
		return complete;
	}

	public void setComplete(String complete) {
		this.complete = complete;
	}

	
	
	@Override
	public String toString() {
		return "Todo [no=" + no + ", todo=" + todo + ", duedate=" + duedate + ", complete=" + complete + "]";
	}
	
}
