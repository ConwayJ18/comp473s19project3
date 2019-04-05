package com.online.facilitymanager.model.inspection;

import com.online.facilitymanager.model.slot.Slot;

public class SafetyInspection extends Inspection
{
	SafetyInspection() {
        super();
      }

      /**
    	 * @param inspectionType
    	 * @param slot
    	 */
    	public SafetyInspection(InspectionType inspectionType, Slot slot)
    	{
    		super(inspectionType, slot);
    	}

      /**
       * @return the inspectionType
       */
      public InspectionType getInspectionType()
      {
        return new SafetyType();
      }

      /**
       * @param inspectionType the inspectionType to set
       */
      public void setInspectionType(InspectionType inspectionType)
      {
        this.inspectionType = inspectionType;
      }

      /**
       * @return the slot
       */
      public Slot getSlot()
      {
        return slot;
      }

      /**
       * @param slot the slot to set
       */
      public void setSlot(Slot slot)
      {
        this.slot = slot;
      }
 }
