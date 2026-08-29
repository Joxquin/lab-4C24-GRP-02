public class StudentController {
	private StudentModel model;
	private StudentView view;
	private StudentReport report;

	public StudentController(StudentModel model, StudentView view, StudentReport report) {
		this.model = model;
		this.view = view;
		this.report = report;
	}

	public void setStudentName(String name) {
		model.setName(name);
	}

	public String getStudentName() {
		return model.getName();
	}

	public void setStudentId(String id) {
		model.setId(id);
	}

	public String getStudentId() {
		return model.getId();
	}

	public void updateView() {
		view.printStudentDetails(model.getName(), model.getId());
	}

	public void createReport() {
		report.generateReport(model.getName(), model.getId());
	}
}