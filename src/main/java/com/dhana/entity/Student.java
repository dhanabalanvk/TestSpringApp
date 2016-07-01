/**
 * 
 */
package com.dhana.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author DhanabalanV
 *
 */
@Entity
@Table(name="student_t")
public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name="stu_id")
	private int stuId;
	@Column(name="stu_name")
	private String stuName;
	/**
	 * @return the stuId
	 */
	public int getStuId() {
		return stuId;
	}
	/**
	 * @param stuId the stuId to set
	 */
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	/**
	 * @return the stuName
	 */
	public String getStuName() {
		return stuName;
	}
	/**
	 * @param stuName the stuName to set
	 */
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	
	
	
}
