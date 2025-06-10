#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void bubbleSort(vector<int> &arr)                                       //Bubble Sort
{
    for (int i = 0; i < arr.size(); i++)
    {
        for (int j = i + 1; j < arr.size(); j++)
        {
            if (arr[i] > arr[j])
            {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
void selectionSort(vector<int> &arr)                                         //Selection Sort
{
    int n = arr.size();
    for (int i = 0; i < n - 1; i++)
    {
        int Minpos = i;
        for (int j = i + 1; j < n; j++)
        {
            if (arr[Minpos] > arr[j])
            {
                Minpos = j;
            }
        }
        int temp = arr[Minpos];
        arr[Minpos] = arr[i];
        arr[i] = temp;
    }
}

void countingSort(vector<int> &arr)                                             //Counting Sort 
{
    if (arr.empty())
        return;

    int largest = arr[0];

    for (int i = 1; i < arr.size(); i++)
    {
        largest = max(largest, arr[i]);
    }

    vector<int> count(largest + 1, 0);

    for (int i = 0; i < arr.size(); i++)
    {
        count[arr[i]]++;
    }

    int j = 0;
    for (int i = 0; i < count.size(); i++)
    {
        while (count[i] > 0)
        {
            arr[j++] = i;
            count[i]--;
        }
    }
}

void merge(vector<int> &arr, int left, int mid, int right)                          //Merge Sort
{
    vector<int> temp;
    int i = left, j = mid + 1;

    while (i <= mid && j <= right)
    {
        if (arr[i] < arr[j])
            temp.push_back(arr[i++]);
        else
            temp.push_back(arr[j++]);
    }

    while (i <= mid)
        temp.push_back(arr[i++]);
    while (j <= right)
        temp.push_back(arr[j++]);

    for (int k = left; k <= right; k++)
    {
        arr[k] = temp[k - left];
    }
}

void mergeSort(vector<int> &arr, int left, int right)
{
    if (left >= right)
        return;

    int mid = (left + right) / 2;
    mergeSort(arr, left, mid);
    mergeSort(arr, mid + 1, right);
    merge(arr, left, mid, right);
}

int partition(vector<int> &arr, int low, int high)                                  //Quick SOrt
{
    int pivot = arr[high]; // Pivot = last element
    int i = low - 1;

    for (int j = low; j < high; j++)
    {
        if (arr[j] <= pivot)
        {
            i++;
            swap(arr[i], arr[j]);
        }
    }
    swap(arr[i + 1], arr[high]);
    return i + 1;
}

void quickSort(vector<int> &arr, int low, int high)
{
    if (low < high)
    {
        int pi = partition(arr, low, high);
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}

int main()
{
    vector<int> unsorted = {4, 2, 4, 1, 5};
    quickSort(unsorted, 0, unsorted.size() - 1);

    for (int ele : unsorted)
    {
        cout << ele << " ";
    }

    return 0;
}