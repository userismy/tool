package test;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import cn.itcast.commons.CommonUtils;
import cn.itcast.jdbc.JdbcUtils;

public class TxQueryRunner {
//	@Test
//      public void testupdate()
//      {
//    	  String sql="insert into t_person(pid,name,age) values(?,?,?)";
//    	  Object[] params={"124","pter",20};//��spl�ж�Ӧ�Ĳ���
//    	  QueryRunner qr=new TxQueryRunner();//���ṩ���ӳ�
//          qr.updates(sql,params);//ִ��sqlҲ���ṩ���ӣ�����JDBCUtils���ӣ�
//      }
//	
//	/*
//	 * ʹ������
//	 */
//	 public void testupdate2()
//     {
//		 try {
//			 //��������
//			  JDBCUtils��beginTransaction();
//			  
//			 //����
//			  String sql="insert into t_person(pid,name,age) values(?,?,?)";
//		   	  Object[] params={"125","p5ter",20};//��spl�ж�Ӧ�Ĳ���
//		   	  QueryRunner qr=new TxQueryRunner();//���ṩ���ӳ�
//		      qr.updates(sql,params);//ִ��sqlҲ���ṩ���ӣ�����JDBCUtils���ӣ�
//		         
//		         
//		     params= new  Object[]{"126","p65ter",23};//��spl�ж�Ӧ�Ĳ���
//		      qr.updates(sql,params);//ִ��sqlҲ���ṩ���ӣ�����JDBCUtils���ӣ�
//			 
//			 //�ύ����
//			 JdbcUtils.commitTransaction();
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			 JdbcUtils.rollbackTransaction();//�����쳣���ع�����
//		}
//   	  
//     }
//	 /**
//	  * ��ѯ
//	  * 1��QueryRunnerִ��select��䣬�õ�Resultset
//	  * 2��Resultsetת������������
//	  */
//	 
//	 //Bean�У����н��
//      public void testquery1()
//      {
//    	  String sql="select * from t_person where pid?";
//    	  QueryRunner qr=new TxQueryRunner();
//    	 Person p= qr.query(sql,new BeanHandler<Person>(Person.class),"1");
//    	 System.out.println(p);
//      }
//      
//      //���н��
//      public void testquery2()
//      {
//    	  String sql="select * from t_person where pid?";
//    	  QueryRunner qr=new TxQueryRunner();
//    	  List<Person> list= qr.query(sql,new BeanListHandler<Person>(Person.class));
//    	 System.out.println(list);
//      }
//      //ʹ��MapHandler,�������װ��Map������
//      public void testquery3()
//      {
//    	  String sql="select * from t_person where pid?";
//    	  QueryRunner qr=new TxQueryRunner();
//    	  Map<String, Object> map = qr.query(sql,new MapHandler<Person>(Person.class));
//    	 System.out.println(map);
//      }
//      
//      //ʹ��MapListHandler�������н����װ��List<Map>��,�����Map��һ�ж�Ӧһ��Map,���ж�ӦList<Map>
//      public void testquery4()
//      {
//    	  String sql="select * from t_person where pid?";
//    	  QueryRunner qr=new TxQueryRunner();
//    	  List<Map<String, Object>> listmap= qr.query(sql,new MapListHandler<Person>(Person.class));
//    	 System.out.println(listmap);
//      }
//      
//      //ʹ��ScalarHandler,�����е��еĽ����װ��Object������
//      public void testquery5()
//      {
//    	  String sql="select count(*) from t_person ";
//    	  QueryRunner qr=new TxQueryRunner();
//    	  Object obj= qr.query(sql,new ScalarHandler<Person>(Person.class));
//    	  //��Object����ǿתΪNumber����
//    	  Number number=(Number)obj;
//    	  int cnt=number.intValue();
//    	 System.out.println(cnt);
//      }
//      
//      //����ѯ��һ��������а������ű���У���MapHandler;
//      /**
//       * 1.�������װ��map��
//       * 2.��map����Person����
//       * 3.��map����address����
//       * 4.������ʵ���������ϵ
//       */
//      public void testquery()
//      {
//    	  String sql="select * from t_person,a_address where pid=aid ";
//    	  QueryRunner qr=new TxQueryRunner();
//    	  //1.�õ�Map
//          Map map=qr.query(sql,new MapHandler(),"aaa");
//          //2 ��Map�еĲ������ݷ�װ��Person��
//          Person p=CommonUtils.toBean(map,Person.class);
//          //3 ��Map�е�ʣ�����ݷ�װ��Address��
//          Address adr=CommonUtils.toBean(map, Address.class);
//          //4 ����ʵ���ϵ
//          p.setAddress(adr);
//          System.out.println(p);
//
//      }
}
