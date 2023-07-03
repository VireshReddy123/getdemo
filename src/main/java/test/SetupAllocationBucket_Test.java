package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.admin.DeleteAllocationBucket;
import org.automation.pageObjects.admin.SetUpAddNewBucket;
import org.automation.pageObjects.admin.UpdateAllocationBucket;
import org.automation.utilities.RandomGenerator;
import org.testng.annotations.Test;

public class SetupAllocationBucket_Test extends BaseTest {

    SetUpAddNewBucket newBucket = new SetUpAddNewBucket();
    UpdateAllocationBucket updateBucket = new UpdateAllocationBucket();
    DeleteAllocationBucket deleteBucket = new DeleteAllocationBucket();

    @Test(priority = 1,enabled = true, description = "Setup Allocation Bucket")
    public void set_Bucket() throws InterruptedException {
        RandomGenerator randomGenerator = new RandomGenerator();

        String allocationBucket = "New Bucket" + randomGenerator.requiredDigits(3);
        newBucket.setUpBucket(allocationBucket);
    }

    @Test(priority = 2, enabled = true,description = "Update Allocation Bucket")
    public void update_Bucket() throws InterruptedException {
        RandomGenerator randomGenerator = new RandomGenerator();
        String allocationBucket = "New Bucket" + randomGenerator.requiredDigits(3);
        updateBucket.updateBucket(allocationBucket);
    }

    @Test(priority = 3,enabled = true, description = "Delete Allocation Bucket")
    public void delete_Bucket() throws InterruptedException {
        deleteBucket.deleteBucket("");
    }

}
