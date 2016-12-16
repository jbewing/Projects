fn main() {
    println!("{}", rec_factorial(10));
    println!("{}", iter_factorial(10));
}

fn rec_factorial(n: u64) -> u64 {
    if n == 0 {
        return 1;
    }
    return n * rec_factorial(n-1);
}

fn iter_factorial(n: u64) -> u64 {
    if n == 0 {
        return 1;
    }

    let mut accum = 1;

    for i in 1..(n+1) {
        accum *= i;
    }
    return accum;
}
