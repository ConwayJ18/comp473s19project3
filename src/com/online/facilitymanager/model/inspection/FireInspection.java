package com.online.facilitymanager.model.inspection;

import com.online.facilitymanager.model.slot.Slot;

public class FireInspection extends Inspection
{
      public FireInspection() {
        super();
      }

      /**
    	 * @param inspectionType
    	 * @param slot
    	 */
    	public FireInspection(InspectionType inspectionType, Slot slot)
    	{
    		super(inspectionType, slot);
    	}

      /**
       * @return the inspectionType
       */
      public InspectionType getInspectionType()
      {
        return new FireType();
      }

      /**
       * @param inspectionType the inspectionType to set
       */
      @Override
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
      @Override
      public void setSlot(Slot slot)
      {
        this.slot = slot;
      }
}