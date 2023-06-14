class Solution:
    def numWaterBottles(self, numBottles: int, numExchange: int) -> int:
        drink_bottle = 0
        
        while True:
            remainingBottle = numBottles % numExchange
            sell_full_bottle = numBottles - remainingBottle
            if sell_full_bottle == 0:
                drink_bottle += numBottles
                break
            drink_bottle += sell_full_bottle
            extra_bottle_obtained = sell_full_bottle // numExchange
            numBottles = remainingBottle + extra_bottle_obtained
        return drink_bottle