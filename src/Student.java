import java.util.Date;

/**
 * Class that stores information about the concrete student
 * 
 * DO NOT REMOVE given methods, but you can add new methods/fields/constructor
 * and change the given methods implementation. For example you can change implementation for equals()
 * or hashCode() method
 * 
 */
public class Student implements Comparable {

	/**
	 * student id
	 */
	private int id;

	/**
	 * student name and surname separated by the whitespace for example:
	 * fullName = "David Luis";
	 */
	private String fullName;

	/**
	 * student date of birth in "yyyy-MM-dd" format
	 */
	private Date birthDate;

	/**
	 * student average mark
	 */
	private double avgMark;

	public Student(int id, String fullName, Date birthDate, double avgMark) {
		this.id = id;
		this.fullName = fullName;
		this.birthDate = birthDate;
		this.avgMark = avgMark;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public double getAvgMark() {
		return avgMark;
	}

	public void setAvgMark(double avgMark) {
		this.avgMark = avgMark;
	}

	@Override
	public int hashCode() {
  return this.getId();
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
  if (!(o instanceof Student)) {
            return false;
        }
		Student s = (Student)o;
		return this.getId() == s.getId() && this.getFullName() == s.getFullName() && this.getAvgMark() == s.getAvgMark() && 
			   this.getBirthDate().compareTo(s.getBirthDate()) == 0;
		return super.equals(obj);
	}
	
	
	/**
	 * DO NOT change this method it will be used during the task check
	 */
	@Override
	public int compareTo(Object o) {
if (!(o instanceof Student)) {
            return -1;
        }
		Student s = (Student)o;
          if(this.getId() < s.getId()) return -1;
		  else if(this.getId() > s.getId()) return 1;
		  else return 0;
		Student other = (Student) o;
		return (this.fullName.compareTo(other.fullName));
	}
}
