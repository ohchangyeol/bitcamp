public class Developer1{
	// method(�Լ�) , field(��������) ����
	
		// field => Ư�� �Ӽ� ǥ��
		String name = "ȫ�浿";
		String job = "������";
		int avglncome = 100; // ����
		int projectCareer;  
		// System.out.println(projectCareer); // ���ͷ� ���� ���ǵ��� �ʰ� ȣ���� �Ѵٸ� ������ �߻�.
	
		//method ==> ��� ����
		public void participateProject(){
			System.out.println("���α׷� ���߷� ���� ����, ��� ����");
			avglncome++;
			projectCareer++;
		}
		// ====================�߰��� method (overLoading Method)==================
		public void participateProject(String project){// ���ڰ��� Ȱ��
			System.out.println(project+" ==>  project ������ ���� ����, ��� ����");
			avglncome++;
			projectCareer++;
		}




		public void instruct(){
			System.out.println("���Ǹ� ���� ��������");
			avglncome++;
		}
		// ====================�߰��� method (overLoading Method)==================
		public void instruct(int lectureCount){// ���ڰ��� Ȱ��
			System.out.println(lectureCount + "�� ���Ǹ� ���� ��������");
			avglncome += lectureCount;
		}
	}
	