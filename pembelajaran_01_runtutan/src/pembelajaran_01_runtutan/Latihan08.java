package pembelajaran_01_runtutan;

import java.util.Scanner;

public class Latihan08 {
	public static class Students {
		Integer npm;
		String fullName;
		String className;
		Integer semester;
		float gpa;
				
		Integer getNPM(Integer value) {
			npm = value;
			return value;
		}
		
		String getFullName(String value) {
			fullName = value;
			return value;
		}
		
		String getClassName(String value) {
			className = value;
			return value;
		}
		
		Integer getSemester(Integer value) {
			semester = value;
			return value;
		}
		
		float getGPA(float value) {
			gpa = value;
			return value;
		}
	}
	
	public static void main(String[] args) {
		Students myBio = new Students();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Full name: ");
		String fullName = input.nextLine();
		
		System.out.print("NPM: ");
		Integer npm = input.nextInt();
		input.nextLine();
		
		System.out.print("Class name: ");
		String className = input.nextLine();
		
		System.out.print("Semester: ");
		Integer semester = input.nextInt();
		
		System.out.print("GPA: ");
		float gpa = input.nextFloat();
		
		System.out.println();
		
		System.out.println("=== BIODATA MAHASISWA ===");
		System.out.println("Full name: " + myBio.getFullName(fullName));
		System.out.println("NPM: " + myBio.getNPM(npm));
		System.out.println("Class name: " + myBio.getClassName(className));
		System.out.println("Semester: " + myBio.getSemester(semester));
		System.out.println("GPA: " + myBio.getGPA(gpa));
	}

}
