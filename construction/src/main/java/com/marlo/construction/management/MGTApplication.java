package com.marlo.construction.management;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class MGTApplication implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private com.marlo.construction.management.MGTBusinessData businessData;
   private com.marlo.construction.common.CommonProcessTask taskData;

   public MGTApplication()
   {
   }

   public com.marlo.construction.management.MGTBusinessData getBusinessData()
   {
      return this.businessData;
   }

   public void setBusinessData(
         com.marlo.construction.management.MGTBusinessData businessData)
   {
      this.businessData = businessData;
   }

   public com.marlo.construction.common.CommonProcessTask getTaskData()
   {
      return this.taskData;
   }

   public void setTaskData(com.marlo.construction.common.CommonProcessTask taskData)
   {
      this.taskData = taskData;
   }

   public MGTApplication(
         com.marlo.construction.management.MGTBusinessData businessData,
         com.marlo.construction.common.CommonProcessTask taskData)
   {
      this.businessData = businessData;
      this.taskData = taskData;
   }

}