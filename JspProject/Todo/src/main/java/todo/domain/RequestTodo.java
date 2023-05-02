package todo.domain;

public class RequestTodo {

	private String todo;
	private String duedate;
	
	
	public RequestTodo(String todo, String duedate) {
		this.todo = todo;
		this.duedate = duedate;
	}
	

	public RequestTodo() {}
	
	

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


	@Override
	public String toString() {
		return "RequestTodo [todo=" + todo + ", duedate=" + duedate + "]";
	}
	
}
