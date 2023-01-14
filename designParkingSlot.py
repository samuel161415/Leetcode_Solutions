 def __init__(self, big: int, medium: int, small: int):
        self.parkingSlot=[None]*3
        self.parkingSlot[0]=big
        self.parkingSlot[1]=medium
        self.parkingSlot[2]=small

    def addCar(self, carType: int) -> bool:
        res=False
        if(self.parkingSlot[carType-1]>0):
            self.parkingSlot[carType-1]-=1
            res=True
        return res
