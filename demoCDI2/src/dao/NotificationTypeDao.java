package dao;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.METHOD;
import javax.inject.Qualifier;

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({FIELD,TYPE,METHOD})
public @interface NotificationTypeDao {

	TypeDao value(); //Quelles valeurs je veux retourner
	
	public enum TypeDao{
		JDBC, JPA;
	}
	
}
