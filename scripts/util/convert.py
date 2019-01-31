#!/usr/local/bin/python3

data = '''
u2 start_pc;
            u2 line_number;
'''

for line in data.split('\n'):
    line = line.strip()
    if not line.startswith('u'):
        continue
    a, b = line.split()
    bs = b.split('_')
    camel = []
    for item in bs:
        item = item[0].upper() + item[1:]
        camel.append(item)
    result = ''.join(camel)
    print('private', a.upper(), result[0].lower() + result[1:])
