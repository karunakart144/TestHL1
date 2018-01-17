/*
 * Copyright (c) 2011.Information Systems(IGATE)
 */

package com.igate.iconnect.constants;

public class MAILTARCKER_QueryConstants {

	public static final String IC_IHD_MAIL_TRACKER_DETAILS = "SELECT TOP 1 MAIL_ID,TO_ADDRESS,FROM_ADDRESS,SUBJECT,DESCRIPTION,ATTACHMENT_PATH,SEVERITY_ID,STATUS,RECEIVED_DATE,SOURCE,REFERENCE_ID,REASON,MTD.CREATED_BY,MTD.CREATED_DATE,MTD.MODIFIED_BY,MTD.MODIFIED_DATE,ATTACHMENT_NAME ,"
		+ " UD.EMPLOYEE_ID FROM IC_MAIL_TRACKER_DETAILS MTD left outer join IC_USER_DETAILS UD  on MTD.FROM_ADDRESS=UD.EMAIL_ADDRESS WHERE MAIL_ID=? ";

	public static final String IC_IHD_MAIL_TRACKER_DISCARD_UPDATE = "UPDATE IC_MAIL_TRACKER_DETAILS SET STATUS=? WHERE MAIL_ID=?";

	public static final String IC_IHD_HR_MAIL_TRACKER_DISCARD_UPDATE = "UPDATE IC_HR_MAIL_TRACKER_DETAILS SET STATUS=? WHERE MAIL_ID=?";


	public static final String IC_IHD_HR_MAIL_TRACKER_DETAILS = "SELECT MAIL_ID,TO_ADDRESS,CASE WHEN EXISTS (select TR.FROM_ADDRESS from IC_HR_MAIL_TRACKER_DETAILS TR JOIN IC_USER_DETAILS UD on TR.FROM_ADDRESS = UD.EMAIL_ADDRESS "
		+ " where TR.FROM_ADDRESS like '%@igate.com%' and UD.IS_ACTIVE = 1 and TR.MAIL_ID = MTD.MAIL_ID) THEN FROM_ADDRESS else FROM_ADDRESS end as 'FROM_ADDRESS', "
		+ " SUBJECT,DESCRIPTION,ATTACHMENT_PATH,SEVERITY_ID,STATUS,RECEIVED_DATE,SOURCE,REFERENCE_ID,REASON,MTD.CREATED_BY,MTD.CREATED_DATE,MTD.MODIFIED_BY,MTD.MODIFIED_DATE, "
		+ " ISNULL(CC_ADDRESS,'') CC_ADDRESS,ATTACHMENT_NAME,UD.EMPLOYEE_ID " 
		+ " FROM IC_HR_MAIL_TRACKER_DETAILS MTD  "
		+ " left outer join IC_USER_DETAILS UD  on MTD.FROM_ADDRESS=UD.EMAIL_ADDRESS " 
		+ " and UD.EMPLOYEE_ID = (select EMPLOYEE_ID from IC_USER_DETAILS where EMAIL_ADDRESS = UD.EMAIL_ADDRESS and IS_ACTIVE = 1) "
		+ " WHERE MAIL_ID=?";
	
	public static final String IC_IHD_HR_MAIL_TRACKER_DETAILS_ONEXCEPTION = "select MAIL_ID,TO_ADDRESS,FROM_ADDRESS,SUBJECT,DESCRIPTION, "
		+ " ATTACHMENT_PATH,SEVERITY_ID,STATUS,RECEIVED_DATE,SOURCE,REFERENCE_ID,REASON,CREATED_BY,CREATED_DATE,MODIFIED_BY,MODIFIED_DATE,isnull(CC_ADDRESS,'Girish.Sampath@igate.com') CC_ADDRESS,ATTACHMENT_NAME,'' as EMPLOYEE_ID " 
		+ " from IC_HR_MAIL_TRACKER_DETAILS where MAIL_ID =?";


	
	public static final String IC_IHD_MAIL_TRACKER_UPDATE = "UPDATE IC_MAIL_TRACKER_DETAILS SET REFERENCE_ID=?,STATUS='CONVERTED' WHERE MAIL_ID=?";

	public static final String IC_IHD_HR_MAIL_TRACKER_UPDATE = "UPDATE IC_HR_MAIL_TRACKER_DETAILS SET REFERENCE_ID=?,STATUS='CONVERTED' WHERE MAIL_ID=?";

}

