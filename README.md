# File Packer Unpacker Project

Java Based Project UnderStanding encryption decryption MARVELLOUS PACKER AND UNPACKER APPLICATION.

---
# DESCRIPTION

This Java-based console application is designed to :
1. **Pack Multiple Files** from a specified directory into a **Single File**.
2. **Unpack File** from a previously packed file, restoring them individually.

---

These tools are helpful for basic file bundling or archiving tasks, such as :  

- Submitting multiple source code files.
- Simple backup operations.
- Consolidating files for transfer.

---
# FEATURES
- Pack multiple file into a single file.
- Extract all files from the packed file.
- Display logs and statistical reports
- Handles all file types (text,binary,images,ect).
- Easy command-line interface
- No external dependencies

---
# PACKER DETAILS

Class Name : `MarvellousPacker`  
Entry Point : `Packer.java`

---
# FUNCATIONALITY :
- Accepts a directory name and a target packed file name.
- Reads all files from the directory.
- Creates a 100-byte header for each file :  
  `"filename filesize"` (padded with spaces)
- Writes the header and file data to the packed file.
- Prints progress and a summary report.

---
# UNPACKER DETAILS
  Class Name : `MarvellousUnpacker`  
  Entry Point : `Unpacker.java`

---
# FUNCTIONALITY :
  - Accepts a packed file name.
  - Reads 100-byte header and extracts file names and sizes.
  - Writes the corresponding file data to new files.
  - Prints progress and a summary report.

