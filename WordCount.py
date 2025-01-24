import os

def count_lines_of_code(directory, extensions):
    total_lines = 0
    file_count = 0

    for root, _, files in os.walk(directory):
        for file in files:
            if any(file.endswith(ext) for ext in extensions):
                file_count += 1
                with open(os.path.join(root, file), 'r', encoding='utf-8', errors='ignore') as f:
                    lines = f.readlines()
                    total_lines += len(lines)
    
    return total_lines, file_count

if __name__ == "__main__":
    # Set the directory of your repository
    repo_directory = "."  # Current directory, change if necessary
    # Add file extensions you want to count
    file_extensions = [".js", ".jsx", ".ts", ".tsx", ".py", ".html", ".css",".java"]

    loc, files = count_lines_of_code(repo_directory, file_extensions)
    print(f"Total Lines of Code: {loc}")
    print(f"Number of Files Counted: {files}")
