package com.bacazy.leetcode.sort;

import org.junit.Test;


public class SortBenchmarkTest {

    @Test
    public void testTest() throws Exception {
        SortBenchmark benchmark = new SortBenchmark();
        benchmark.addSortMethod(new QuickSort());
        benchmark.addSortMethod(new HeapSort());
        benchmark.addSortMethod(new InsertionSort());
        benchmark.addSortMethod(new SelectionSort());
        benchmark.addSortMethod(new ShellSort());
        benchmark.addSortMethod(new MergeSort());
        benchmark.addSortMethod(new QuickThreeWaySort());
        benchmark.addTestArraySize(10);
        benchmark.addTestArraySize(100);
        benchmark.addTestArraySize(500);
        benchmark.addTestArraySize(1000);
        benchmark.test();
    }
}