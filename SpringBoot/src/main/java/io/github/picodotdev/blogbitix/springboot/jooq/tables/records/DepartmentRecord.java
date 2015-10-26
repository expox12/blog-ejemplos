/**
 * This class is generated by jOOQ
 */
package io.github.picodotdev.blogbitix.springboot.jooq.tables.records;


import io.github.picodotdev.blogbitix.springboot.jooq.tables.Department;
import io.github.picodotdev.blogbitix.springboot.jooq.tables.interfaces.IDepartment;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


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
public class DepartmentRecord extends UpdatableRecordImpl<DepartmentRecord> implements Record2<Long, String>, IDepartment {

	private static final long serialVersionUID = -1755687243;

	/**
	 * Setter for <code>JOOQ.DEPARTMENT.ID</code>.
	 */
	@Override
	public void setId(Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>JOOQ.DEPARTMENT.ID</code>.
	 */
	@NotNull
	@Override
	public Long getId() {
		return (Long) getValue(0);
	}

	/**
	 * Setter for <code>JOOQ.DEPARTMENT.NAME</code>.
	 */
	@Override
	public void setName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>JOOQ.DEPARTMENT.NAME</code>.
	 */
	@Size(max = 256)
	@Override
	public String getName() {
		return (String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Long> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Long, String> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Long, String> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return Department.DEPARTMENT.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Department.DEPARTMENT.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DepartmentRecord value1(Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DepartmentRecord value2(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DepartmentRecord values(Long value1, String value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(IDepartment from) {
		setId(from.getId());
		setName(from.getName());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IDepartment> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached DepartmentRecord
	 */
	public DepartmentRecord() {
		super(Department.DEPARTMENT);
	}

	/**
	 * Create a detached, initialised DepartmentRecord
	 */
	public DepartmentRecord(Long id, String name) {
		super(Department.DEPARTMENT);

		setValue(0, id);
		setValue(1, name);
	}
}
