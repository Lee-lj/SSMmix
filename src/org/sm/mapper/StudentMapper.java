package org.sm.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.sm.entity.Student;

public interface StudentMapper {
	/*1.��������mapper.xml�еı�ǩidֵ��ͬ
	 * 2.���������������mapper�е�parameterType����һ��
	 * 3.���������������mapper.xml�е�resultTypeһ��
	 * <select id="selectByNo" resultType="thirdclass.Student" parameterType="int">����Student selectByNo(int stuNo);
	 * �ӿ�����ȫ��������persionMapper�е�namespace�������ӿھͿ����Զ�����PersionMapper.xml 
	 */
 //�ӿ����еķ���Ĭ�϶���public abstract�����Կ�д�ɲ�дpublic abstract Student selectByNo(int stuNo);
	//����ֵ+sql����id+(��������),û�з���ֵ����void
	//���۷���ֵ��һ�����Ƕ����student List<student>,��mapper.xml�е�resultTypeֻдһ��
	//ͨ��session�����ȡ�ӿ�session.getMapper(�ӿ�.class)���ٵ��øýӿڵķ�����������Զ�ִ�и÷�����Ӧ��sql���
	Student selectByNo(int stuNo); //����һ��
	List<Student> selectAll();//����ȫ��
	void deleteByNo(int stuNo);//ɾ��
	void insertStudent(Student student);//����
	void updateByNo(Student student);
	Student selectOne(int stuNo);
	void insertWithConverter(Student student);
	List<Student> selectStudentOrderByName();//��ѯ����ѧ�����������־�̬����
	List<Student> selectStudentOrderByColumn(String column);//��ѯ����ѧ������ĳ�����Զ�̬����
	List<Student> selectStudentBystuNameOrstuAge(Student student);//����ѧ�ź�������ѧ��
	List<Student> selectStudentBystuNameOrstuAgeWithHashMap(HashMap<String,Object> map);//String , Object
	int selectStudentCount();
	void querystudentByGrade(Map<String,Object> params);//���ô洢���̣�����ĳ���꼶��������
	HashMap<String,Object> selectStudentOutHashMap();//���Ϊhashmap����
	List<HashMap<String,Object>> selectAllStudentHashMap();//ʹ��hashmap������ѧ���Ķ������
	Student selectWithSqlTag(Student student);//��sql��ǩ�Ķ�̬sql��ѯ
	List<Student> selectWithArray(int[] Nos);//һ�β�ѯ���ѧ��,���鷽ʽ
	List<Student> selectWithList(List<Integer> Nos);//һ�β�ѯ���ѧ��,���Ϸ�ʽ
	List<Student> selectWithTargetList(Student[] students);//һ�β�ѯ���ѧ��,�������鷽ʽ
	Student selectConnectionWithresultMap(int stuNo);//����mybatis�ṩ��resultmapʵ��һ��һ������ѯ 
	List<Student> selectWithLazyload();//���ӳټ��ص�һ��һ����ѯȫ��ѧ����������Ҫ��ѯ��Ӧ��ѧ��֤��Ϣ
}
	