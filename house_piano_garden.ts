import { Observable, Subject, BehaviorSubject } from 'rxjs';

//This class is used for cleanly handling the data manipulation and state between components.
class DataHandler {
    private dataSet: any[];
    private currentItemSubject:BehaviorSubject<any>;
    currentItem:Observable<any>;

    constructor(){
        //initialize handlers 
        this.dataSet = []; 
        this.currentItemSubject = new BehaviorSubject<any>(null); 
        this.currentItem = this.currentItemSubject.asObservable(); 
    }
    
    // function to set the data set 
    setDataSet(dataSet: any[]){
        //cleanup existing value
        this.dataSet = [];
        //set new dataset
        this.dataSet = dataSet;
    }

    // function to get item from dataset of specific index without changing the dataset value
    getItem(index: number): any {
        return this.dataSet[index];
    }

    // This function is used to update value of item in the dataset
    updateItemAt(index: number, item: any){
        //check if index is out of bound of dataset
        if(index<0 || index > this.dataSet.length){
            console.error('Index is out of bound of dataset');
            return;
        }
        //clean out existing value
        this.dataSet[index] = null;
        //update value
        this.dataSet[index] = item;
    }

    //function to set the current item to the value passed in 
    setCurrentItem(item: any){
        this.currentItemSubject.next(item);
    }
    
    //This function is used to remove an item from the dataset
    removeItem(index: number) {
        //check if index is out of bound of dataset
        if(index<0 || index > this.dataSet.length){
            console.error('Index is out of bound of dataset');
            return;
        }
        //remove item from dataset
        this.dataSet.splice(index, 1);
    }

    // This function is used to add item to the dataset
    addItem(item: any){
        this.dataSet.push(item);
    }
}

export default DataHandler;