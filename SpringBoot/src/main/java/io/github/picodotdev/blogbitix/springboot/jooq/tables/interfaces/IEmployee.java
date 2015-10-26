/**
 * This class is generated by jOOQ
 */
package io.github.picodotdev.blogbitix.springboot.jooq.tables.interfaces;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IEmployee extends Serializable {

	/**
	 * Setter for <code>JOOQ.EMPLOYEE.ID</code>.
	 */
	public void setId(Long value);

	/**
	 * Getter for <code>JOOQ.EMPLOYEE.ID</code>.
	 */
	@NotNull
	public Long getId();

	/**
	 * Setter for <code>JOOQ.EMPLOYEE.NAME</code>.
	 */
	public void setName(String value);

	/**
	 * Getter for <code>JOOQ.EMPLOYEE.NAME</code>.
	 */
	@Size(max = 256)
	public String getName();

	/**
	 * Setter for <code>JOOQ.EMPLOYEE.SURNAME</code>.
	 */
	public void setSurname(String value);

	/**
	 * Getter for <code>JOOQ.EMPLOYEE.SURNAME</code>.
	 */
	@Size(max = 256)
	public String getSurname();

	/**
	 * Setter for <code>JOOQ.EMPLOYEE.BIRTHDAY</code>.
	 */
	public void setBirthday(LocalDateTime value);

	/**
	 * Getter for <code>JOOQ.EMPLOYEE.BIRTHDAY</code>.
	 */
	public LocalDateTime getBirthday();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IEmployee
	 */
	public void from(io.github.picodotdev.blogbitix.springboot.jooq.tables.interfaces.IEmployee from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IEmployee
	 */
	public <E extends io.github.picodotdev.blogbitix.springboot.jooq.tables.interfaces.IEmployee> E into(E into);
}
