class TwoSum:
    def twoSum(self, nums, target):
        for i in range(len(nums) - 1):
            if(nums[i] + nums[i+1] == target):
                return i, i+1
        return []

nums = {1,2,4,6}
target = 6
obj = TwoSum()
obj.twoSum(nums, target)