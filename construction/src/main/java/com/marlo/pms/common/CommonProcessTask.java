package com.marlo.pms.common;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CommonProcessTask implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String pathCd;
   private java.lang.String groupName;
   private java.lang.String taskName;
   private java.lang.String taskDescription;
   private java.lang.String processCd;
   private java.lang.String ruleName;
   private java.lang.String userName;

   private java.util.Date taskExpiryDate;

   public CommonProcessTask()
   {
   }

   public java.lang.String getPathCd()
   {
      return this.pathCd;
   }

   public void setPathCd(java.lang.String pathCd)
   {
      this.pathCd = pathCd;
   }

   public java.lang.String getGroupName()
   {
      return this.groupName;
   }

   public void setGroupName(java.lang.String groupName)
   {
      this.groupName = groupName;
   }

   public java.lang.String getTaskName()
   {
      return this.taskName;
   }

   public void setTaskName(java.lang.String taskName)
   {
      this.taskName = taskName;
   }

   public java.lang.String getTaskDescription()
   {
      return this.taskDescription;
   }

   public void setTaskDescription(java.lang.String taskDescription)
   {
      this.taskDescription = taskDescription;
   }

   public java.lang.String getProcessCd()
   {
      return this.processCd;
   }

   public void setProcessCd(java.lang.String processCd)
   {
      this.processCd = processCd;
   }

   public java.lang.String getRuleName()
   {
      return this.ruleName;
   }

   public void setRuleName(java.lang.String ruleName)
   {
      this.ruleName = ruleName;
   }

   public java.lang.String getUserName()
   {
      return this.userName;
   }

   public void setUserName(java.lang.String userName)
   {
      this.userName = userName;
   }

   public String toString()
   {
      StringBuffer strBuffer = new StringBuffer();
      strBuffer.append("processCd:" + processCd + "\n");
      strBuffer.append("pathCd:" + pathCd + "\n");
      strBuffer.append("groupName:" + groupName + "\n");
      strBuffer.append("taskName:" + taskName + "\n");
      strBuffer.append("taskDescription:" + taskDescription + "\n");
      strBuffer.append("ruleName:" + ruleName + "\n");
      strBuffer.append("userName:" + userName + "\n");
      return strBuffer.toString();
   }

   public java.util.Date getTaskExpiryDate()
   {
      return this.taskExpiryDate;
   }

   public void setTaskExpiryDate(java.util.Date taskExpiryDate)
   {
      this.taskExpiryDate = taskExpiryDate;
   }

   public CommonProcessTask(java.lang.String pathCd, java.lang.String groupName,
         java.lang.String taskName, java.lang.String taskDescription,
         java.lang.String processCd, java.lang.String ruleName,
         java.lang.String userName, java.util.Date taskExpiryDate)
   {
      this.pathCd = pathCd;
      this.groupName = groupName;
      this.taskName = taskName;
      this.taskDescription = taskDescription;
      this.processCd = processCd;
      this.ruleName = ruleName;
      this.userName = userName;
      this.taskExpiryDate = taskExpiryDate;
   }
}