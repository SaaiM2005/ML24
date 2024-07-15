"""x=int(input("ENTER YOUR AGE:"))
print("YOUR AGE IS",x)
if(x>18):
    print("YOU CAN DRIVE")
else:
    print("YOU CANNOT DRIVE")
"""
price=int(input("ENTER THE AMOUNT YOU HAVE:"))
appleprice=int(input("ENTER THE APPLE PRICE:"))
if(price>appleprice):
    print("YOU CAN BUY APPLE")
elif(price-appleprice>5):
    print("YOU CAN STILL BUY APPLE")
else:
    print("DONT BUY APPLE.")
